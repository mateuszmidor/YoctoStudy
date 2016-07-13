# cmake.bbclass knows how to deal with cmake based projects
inherit cmake 

# setup the source code directory
S = "${WORKDIR}/git"

# short project description and license
DESCRIPTION = "Custom recipe demo that simply prints out a message."
LICENSE = "CLOSED"

# list of project dependencies separated by spaces. Not needed for now
# DEPENDS = " "

# project source location and commit revision (revision must be kept up to date manually)
SRC_URI = "git://github.com/mateuszmidor/YoctoStudy;protocol=http;branch=custom_recipe_demo"
SRCREV = "2aaf7b34d339d579b7c5d8ba16f6874d1df02acb"