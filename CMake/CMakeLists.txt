cmake_minimum_required(VERSION 3.10)

project(Tutorial VERSION 0.0)

set(CMAKE_CXX_STANDARD_REQUIRED ON)

set(CMAKE_CXX_STANDARD 14)

option(USE_MA "whether use ma lib" ON)

configure_file(include/TutorialConfig.h.in TutorialConfig.h)

if (USE_MA)
    add_subdirectory(ma)

    list(APPEND EXTRA_LIBS ma)

    list(APPEND EXTRA_INCLUDES "${PROJECT_SOURCE_DIR}/ma")
endif ()

add_executable(Tutorial src/tutorial.cpp)

target_link_libraries(Tutorial PUBLIC ${EXTRA_LIBS})

target_include_directories(Tutorial PUBLIC "${PROJECT_BINARY_DIR}" ${EXTRA_INCLUDES})

install(TARGETS Tutorial DESTINATION bin)

install(FILES "${PROJECT_BINARY_DIR}/TutorialConfig.h" DESTINATION include)
