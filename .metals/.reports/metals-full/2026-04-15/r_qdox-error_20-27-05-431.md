error id: file://<WORKSPACE>/src/main/java/infinityliblightingpatch/InfinityLibLightingPatch.java
file://<WORKSPACE>/src/main/java/infinityliblightingpatch/InfinityLibLightingPatch.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[26,2]

error in qdox parser
file content:
```java
offset: 1264
uri: file://<WORKSPACE>/src/main/java/infinityliblightingpatch/InfinityLibLightingPatch.java
text:
```scala
package infinityliblightingpatch;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import infinityliblightingpatch.capability.CapabilityExampleHandler;
import infinityliblightingpatch.handlers.ModRegistry;
import infinityliblightingpatch.proxy.CommonProxy;

@Mod(modid = InfinityLibLightingPatch.MODID, version = InfinityLibLightingPatch.VERSION, name = InfinityLibLightingPatch.NAME, dependencies = "required-after:fermiumbooter")
public class InfinityLibLightingPatch {
	public static final String MODID = "infinityliblightingpatch";
	public static final String VERSION = "1.0.0";
	public static final String NAME = "InfinityLib Lighting Patch";
	public static final Logger LOGGER = LogManager.getLogger();
	public static boolean completedLoading = false;

	@SidedProxy(clientSide = "infinityliblightingpatch.proxy.ClientProxy", serverSide = "infinityliblightingpatch.proxy.CommonProxy")
	public static CommonProxy PROXY;

	@Instance(MODID)
	p@@ublic static InfinityLib Lighting
	Patch instance;

	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModRegistry.init();
        InfinityLib Lighting Patch.PROXY.preInit();

        CapabilityExampleHandler.registerCapability();
    }

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		completedLoading = true;
	}
}

```

```



#### Error stacktrace:

```
com.thoughtworks.qdox.parser.impl.Parser.yyerror(Parser.java:2025)
	com.thoughtworks.qdox.parser.impl.Parser.yyparse(Parser.java:2147)
	com.thoughtworks.qdox.parser.impl.Parser.parse(Parser.java:2006)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:232)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:190)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:94)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:89)
	com.thoughtworks.qdox.library.SortedClassLibraryBuilder.addSource(SortedClassLibraryBuilder.java:162)
	com.thoughtworks.qdox.JavaProjectBuilder.addSource(JavaProjectBuilder.java:174)
	scala.meta.internal.mtags.JavaMtags.indexRoot(JavaMtags.scala:49)
	scala.meta.internal.metals.SemanticdbDefinition$.foreachWithReturnMtags(SemanticdbDefinition.scala:99)
	scala.meta.internal.metals.Indexer.indexSourceFile(Indexer.scala:560)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3(Indexer.scala:691)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3$adapted(Indexer.scala:688)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:630)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:628)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1313)
	scala.meta.internal.metals.Indexer.reindexWorkspaceSources(Indexer.scala:688)
	scala.meta.internal.metals.MetalsLspService.$anonfun$onChange$2(MetalsLspService.scala:940)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	scala.concurrent.Future$.$anonfun$apply$1(Future.scala:691)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:500)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:840)
```
#### Short summary: 

QDox parse error in file://<WORKSPACE>/src/main/java/infinityliblightingpatch/InfinityLibLightingPatch.java