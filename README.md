# Locus Map, TTS commands

Repository for TTS voice commands for Locus Map application.

Voices are used for *Navigation* and *Audio coach* systems.

## Distribution

The library is served as an Android AAR via [JitPack](https://jitpack.io):

```
com.github.asamm:locus-map-tts-commands:<git-tag>
```

JitPack builds on demand the first time a given tag is requested — no publishing workflow lives in this repo. To cut a new release, push a git tag (e.g. `0.1.0`); the next consumer build will trigger JitPack to assemble the AAR.

The TTS file-format revision is tracked in [`CHANGELOG.md`](CHANGELOG.md) under `VERSION N` headings, independently of the released tag.

## Contribution

We always update `en.tts` first, so use it as the canonical sample of what is currently supported. `cs.tts` is also maintained by us and is a good example of how to handle languages more complex than English.

There are two ways to contribute changes or a new TTS voice. Before we accept anything, please use the *Custom voice* method below to test your modifications on a real device.

The format used in `.tts` files is JSON; it is very sensitive to syntax errors, so please double-check before publishing.

### Pull request

Recommended. Useful if you plan to contribute more often and are comfortable with the Git workflow. Once a PR is merged, the change reaches Locus Map users only after a new tag is pushed.

### Open an issue

Open a [new issue](https://github.com/asamm/locus-map-tts-commands/issues) in this repository with the proposed changes. We will confirm and merge them as soon as possible.

## Custom voices

For testing (or to create your own funny voice), a simple method is supported:

Copy any `*.tts` file into the `/Locus/data/tts/` directory. When creating a TTS engine inside the app, Locus first checks whether a matching file exists there and uses it if so.

## TTS file format

TODO
