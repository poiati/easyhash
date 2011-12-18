/*
Copyright 2011 Paulo Poiati

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.easyhash;

import static com.easyhash.HashGenerator.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class HashGeneratorJavaTest {
    
    @Test
    public void testMd5() {
        assertEquals("ab07acbb1e496801937adfa772424bf7", HashGenerator.md5("foo bar baz"));
        assertEquals("b071ed8a2de56ecd5958305641a81755", HashGenerator.md5("frodo bags"));
    }
    
    @Test
    public void testSha1() {
        assertEquals("c7567e8b39e2428e38bf9c9226ac68de4c67dc39", HashGenerator.sha1("foo bar baz"));
        assertEquals("b6b5ece040fd0c467cb189a284c6e7c752c747f5", HashGenerator.sha1("frodo bags"));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testNullValueMd5() {        
        HashGenerator.md5(null);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testNullValueSha1() {        
        HashGenerator.sha1(null);
    }
}