/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class TestSuiteMembership extends SObject {
	public static SObjectType$<TestSuiteMembership> SObjectType;
	public static SObjectFields$<TestSuiteMembership> Fields;

	public Id ApexClassId;
	public ApexClass ApexClass;
	public Id ApexTestSuiteId;
	public ApexTestSuite ApexTestSuite;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public TestSuiteMembership clone$() {throw new java.lang.UnsupportedOperationException();}
	public TestSuiteMembership clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TestSuiteMembership clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TestSuiteMembership clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TestSuiteMembership clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
