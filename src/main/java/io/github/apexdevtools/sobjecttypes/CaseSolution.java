/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class CaseSolution extends SObject {
	public static SObjectType$<CaseSolution> SObjectType;
	public static SObjectFields$<CaseSolution> Fields;

	public Id CaseId;
	public Case Case;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id SolutionId;
	public Solution Solution;
	public Datetime SystemModstamp;

	public CaseSolution clone$() {throw new java.lang.UnsupportedOperationException();}
	public CaseSolution clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CaseSolution clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CaseSolution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CaseSolution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
