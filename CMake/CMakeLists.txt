cmake_minimum_required(VERSION 3.10)

project(Tutorial VERSION 0.0)

set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_STANDARD 20)

configure_file(include/TutorialConfig.h.in TutorialConfig.h)

add_executable(Tutorial src/main.cpp)

target_include_directories(Tutorial PUBLIC ${PROJECT_BINARY_DIR})
