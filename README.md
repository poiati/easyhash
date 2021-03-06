# Easyhash

The easyhash is an utility to easily generate cryptographic hashes in it's hexadecimal form.

Currently two cryptographic hash function are supported:

- MD5
- SHA-1

# Usage

You can use easyhash in Java or Groovy programs.

### Java

First, Put the easyhash jar into the classpath and then:

    import static com.lazythought.easyhash.HashGenerator.*;
    ...
    assert "ab07acbb1e496801937adfa772424bf7".equals(HashGenerator.md5("foo bar baz"));
    assert "c7567e8b39e2428e38bf9c9226ac68de4c67dc39".equals(HashGenerator.sha1("foo bar baz"));
    ...
 
### Groovy

With Groovy you can use the @Grab AST:
 
    @Grab('com.lazythought:easyhash:1.0')
    import static com.lazythought.easyhash.HashGenerator.*
 
    assert 'ab07acbb1e496801937adfa772424bf7' == md5('foo bar baz')
    assert 'c7567e8b39e2428e38bf9c9226ac68de4c67dc39' == sha1('foo bar baz')
 
There is also the HashCategory option:

    @Grab('com.lazythought:easyhash:1.0')
    import com.lazythought.easyhash.HashCategory
 
    use(HashCategory) {
        assert 'b071ed8a2de56ecd5958305641a81755' == 'frodo bags'.md5()
        assert 'b6b5ece040fd0c467cb189a284c6e7c752c747f5' == 'frodo bags'.sha1()
    }

# Build

Build with Gradle ( http://gradle.org/ ):

    # gradle build

# Support & Contact

- Email: paulogpoiati@gmail.com
- Twitter: http://twitter.com/poiati