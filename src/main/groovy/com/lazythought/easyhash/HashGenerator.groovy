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

import java.security.MessageDigest

class HashGenerator {
    
    static final MD5 = 'MD5'
    static final MD5_LENGTH  = 32
    static final SHA1 = 'SHA-1'
    static final SHA1_LENGTH  = 40
    static final FILL_WITH = '0'
    
    static String md5(final String input) {
        _checkInput(input)
        _convertToHexString(_getDigest(MD5, input), MD5_LENGTH)
    }
    
    static String sha1(final String input) {
        _checkInput(input)
        _convertToHexString(_getDigest(SHA1, input), SHA1_LENGTH)
    }
    
    private static _getDigest(algorithm, input) {
        def messageDigest = MessageDigest.getInstance(algorithm)
        messageDigest.update(input.getBytes())
        messageDigest.digest()
    }
    
    private static _convertToHexString(data, length) {
        new BigInteger(1, data).toString(16).padLeft(length, FILL_WITH)
    }
    
    private static _checkInput(input) {
        if (input == null)
            throw new IllegalArgumentException("Your reference is null. Can't generate the hash.")
    }
}