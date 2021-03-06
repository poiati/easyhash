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
package com.lazythought.easyhash

class HashGeneratorTest extends GroovyTestCase {
    
    void testMd5() {
        assert 'ab07acbb1e496801937adfa772424bf7' == HashGenerator.md5('foo bar baz')
        assert 'b071ed8a2de56ecd5958305641a81755' == HashGenerator.md5('frodo bags')
    }
    
    void testSha1() {
        assert 'c7567e8b39e2428e38bf9c9226ac68de4c67dc39' == HashGenerator.sha1('foo bar baz')
        assert 'b6b5ece040fd0c467cb189a284c6e7c752c747f5' == HashGenerator.sha1('frodo bags')
    }
    
    void testNullValue() {
        shouldFail(IllegalArgumentException) {
            HashGenerator.md5 null
        }
        
        shouldFail(IllegalArgumentException) {
            HashGenerator.sha1 null
        }
    }
    
}