/**
 * @file main source file
 * @author c50034865
 * @date 2023/7/31
 * @version 0.0
 */

#include "iostream"
#include "TutorialConfig.h"

int main(int argc, char const *argv[]) {
    std::cout << "Hello CMake!" << std::endl;

    if (argc < 2) {
        std::cout << argv[0] << " Version " << Tutorial_VERSION_MAJOR << "." << Tutorial_VERSION_MINOR << std::endl;
    }

    return 0;
}
