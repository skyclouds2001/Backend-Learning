add_library(ma STATIC ma.cpp)

set_target_properties(ma PROPERTIES VERSION 0.0 SOVERSION 1)

install(TARGETS ma DESTINATION lib)

install(FILES ma.h DESTINATION include)
