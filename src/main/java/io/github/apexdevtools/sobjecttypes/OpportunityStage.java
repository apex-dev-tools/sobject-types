/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class OpportunityStage extends SObject {
	public static SObjectType$<OpportunityStage> SObjectType;
	public static SObjectFields$<OpportunityStage> Fields;

	public String ApiName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal DefaultProbability;
	public String Description;
	public String ForecastCategory;
	public String ForecastCategoryName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsClosed;
	public Boolean IsWon;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Integer SortOrder;
	public Datetime SystemModstamp;

	public OpportunityStage clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityStage clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityStage clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityStage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityStage clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
