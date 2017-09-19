package org.xtext.ada2005.tests;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.eclipse.acceleo.query.runtime.EvaluationResult;
import org.eclipse.acceleo.query.runtime.IQueryBuilderEngine.AstResult;
import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.Query;
import org.eclipse.acceleo.query.runtime.impl.QueryBuilderEngine;
import org.eclipse.acceleo.query.runtime.impl.QueryEvaluationEngine;
import org.junit.Test;
import org.xtext.ada2005.adb.Compilation;

import com.google.common.collect.Maps;

public class TestAQL extends TestingAdbParser {
	   public @Test void labo()
	    {
	    CR cr = run("labo"); 
	    assertEquals(CR.OK, cr);
	    Compilation model = this.model;
	    IQueryEnvironment queryEnvironment = Query.newEnvironmentWithDefaultServices(null);
	    // ServiceRegistrationResult registrationResult = queryEnvironment.registerServicePackage(MyServices.class);
	    //queryEnvironment.registerEPackage(null); //org.xtext.ada2005.adb.AdbPackage.eINSTANCE);
	    QueryBuilderEngine builder = new QueryBuilderEngine(queryEnvironment);
	    AstResult astResult = builder.build("self.compilationUnits");
	    QueryEvaluationEngine engine = new QueryEvaluationEngine(queryEnvironment);
	    Map<String, Object> variables = Maps.newHashMap();
	    variables.put("self", model);
	    EvaluationResult evaluationResult = engine.eval(astResult, variables);
	    
	    Object result = evaluationResult.getResult();
	    
	    int i = 0,j = 0;
	    i++;
	    j = i;
	    } 
}
