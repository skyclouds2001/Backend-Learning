/**
 * @file tutorial.cpp
 * @brief main entry file
 * @copyright Copyright 2023 skyclouds2001
 * @license MIT
 * @author c50034865
 * @date 2023/7/31
 * @version v0.0.0
 */

#include "iostream"
#include "TutorialConfig.h"
#include "ma.h"

int main(int argc, char const *argv[]) {
    std::cout << "Hello CMake!" << std::endl;

    if (argc < 2) {
        std::cout << argv[0] << " Version " << Tutorial_VERSION_MAJOR << "." << Tutorial_VERSION_MINOR << std::endl;
    }

    std::cout << "|10|=" << ma::abs(10) << std::endl << "|-10|=" << ma::abs(-10) << std::endl;

    return 0;
}
