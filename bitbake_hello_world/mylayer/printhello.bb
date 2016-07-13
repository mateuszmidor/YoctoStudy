DESCRIPTION = "Prints Hello World"

# Package Name
PN = 'printhello'

# Package Version
PV = '1'

# always run this recipe, no matter if it was already run and cached
do_build[nostamp] = "1"

python do_build() {
	bb.plain("********************");
	bb.plain("*                  *");
	bb.plain("*  Hello, World!   *");
	bb.plain("*                  *");
	bb.plain("********************");
}
