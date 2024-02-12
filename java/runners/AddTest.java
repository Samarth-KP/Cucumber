package runners;

	@CucumberOptions(features = "src//test//resources//features//TaggedFeature.feature"
			,glue = "stepDefinations", tags = "@regression or @smoke" )
	public class AddTest extends AbstractTestNGCucumberTests
	{
		
	}
