SUMMARY = "A Qt5 development image"
HOMEPAGE = "http://www.jumpnowtek.com"
LICENSE = "MIT"

require console-image.bb

# Introduced so building sdk will generate representative rootfs as well as qt tools.
inherit populate_sdk_qt5

QT_TOOLS = " \
    qtbase \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
    qtserialport-dev \
    qtserialport-mkspecs \
    qt5-env \
 "

FONTS = " \
    fontconfig \
    fontconfig-dev \
    fontconfig-utils \
    ttf-bitstream-vera \
"

TSLIB = " \
    tslib \
    tslib-calibrate \
    tslib-conf \
    tslib-dev \
    tslib-tests \
 "

IMAGE_INSTALL += " \
    ${FONTS} \
    ${QT_TOOLS} \
    qcolorcheck \
    qfontchooser \
    qkeytest \
    qshowfonts \
    ${TSLIB} \
    tspress \
 "

export IMAGE_BASENAME = "qt5-image"
