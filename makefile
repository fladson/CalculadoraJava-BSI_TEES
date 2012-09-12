#---------------------------------------------------------------------------
#
#  Directories
#
#---------------------------------------------------------------------------

DEV_ROOT = .
  
SourceDir        = $(DEV_ROOT)/src
#TargetDir        = $(DEV_ROOT)/obj
TargetDir        = $(DEV_ROOT)/src
LibDir           = $(DEV_ROOT)/lib
MakeDir          = $(DEV_ROOT)/make
BinDir           = $(DEV_ROOT)/bin
DocsDir          = $(DEV_ROOT)/docs
CurrentDir       = $(CURDIR)

JAVA_HOME = /usr/lib/jvm/java-7-oracle

ifdef Source
    Package          = $(subst $(SourceDir)/,,$(CurrentDir))
    PackageList      = $(Package)
    PackageSourceDir = $(SourceDir)/$(Package)
    PackageTargetDir = $(TargetDir)/$(Package)
    JavaMainClass    = $(subst /,.,$(Package)).$(Main)
else
    PackageList      = $(Packages) $(JavaPackages)
endif

PackageListLoop  = $(patsubst %,$(SourceDir)/%/.loop,$(PackageList))

JRE              = $(JAVA_HOME)/jre/lib/rt.jar

ifdef IS_UNIX
    X = :
else
    X = :
endif

#
# Misc
#
  ClassPath        = $(JRE)$(X)$(TargetDir)$(X)$(ThirdPartyJars)
  JavaPackageNames = $(subst /,.,$(JavaPackages))
  IncludePath      = -I$(SourceDir) $(IncludeDirs:%=-I%)
  LibDirs          = -L$(LibDir)    $(LibraryDirs:%=-L%)
  LocalLibs        = $(subst /,,$(Packages))
  LibList          = $(LocalLibs:%=-l%) $(Libraries:%=-l%)
  
#---------------------------------------------------------------------------
#
#  Tools & Options
#
#---------------------------------------------------------------------------
Print                  = @echo
Copy                   = cp
MakeDepend             = makedepend
MakeDir                = mkdir -p
Delete                 = rm -fr
StaticArchiver         = ar
DynamicArchiver        = gcc
FortranCompiler        = f77
JavaCompiler           = $(JAVA_HOME)/bin/javac
JavaArchiver           = $(JAVA_HOME)/bin/jar
JarSigner              = $(JAVA_HOME)/bin/jarsigner
JavadocGenerator       = $(JAVA_HOME)/bin/javadoc
JniCompiler            = $(JAVA_HOME)/bin/javah
RmiCompiler            = $(JAVA_HOME)/bin/rmic
JavaExecute            = $(JAVA_HOME)/bin/java
Purify                 = purify
WordCount              = wc
List                   = cat

MakeOptions            = -k -s
MakeDependOptions      =
StaticArchiverOptions  = rc
DynamicArchiverOptions = -shared
JavaArchiverOptions    =
JniOptions             =
RmiOptions             = -d $(TargetDir) -classpath $(ClassPath) \
 			 -sourcepath $(SourceDir)
FortranOptions         =
JavaCompilerOptions    = -d $(TargetDir) -classpath $(ClassPath) \
  			 -sourcepath $(SourceDir) -deprecation
JavaRunOptions         = -classpath $(ClassPath)
PurifyOptions          =

JavaPackages = \
          view \
	  logic \

JavaLibraries =

JavaMainClass = \
          view.App

RunParameters =
  
# Javadoc
JavadocWindowTitle = 'Geotechnical Software Services - API Specification'
JavadocDocTitle    = 'GeoSoft API'
JavadocHeader      = 'GeoSoft API'
JavadocFooter      = '<font size="-1">Copyright &copy; 2004 - Geotechnical Software Services <a href="http://geosoft.no">geosoft.no<a></font>'

JavadocOptions         = -d $(DocsDir) \
  			 -sourcepath $(SourceDir) \
  			 -classpath $(ClassPath) \
  			 -author \
  			 -package \
  			 -use \
  			 -splitIndex \
  			 -version \
  			 -link file:$(JAVA_HOME)/docs/api \
  			 -windowtitle $(JavadocWindowTitle) \
  			 -doctitle $(JavadocDocTitle) \
  			 -header $(JavadocHeader) \
  			 -bottom $(JavadocFooter)

# .class -> JavaDoc
javadoc :
	$(Print) $(JavaPackageNames) > $(DEV_ROOT)/packages.tmp
	$(JavadocGenerator) $(JavadocOptions) @$(DEV_ROOT)/packages.tmp
	$(Delete) $(DEV_ROOT)/packages.tmp
	$(Print) Done JavaDoc.

jar :
	$(Print) Gerando o Jar.

default: javadoc
