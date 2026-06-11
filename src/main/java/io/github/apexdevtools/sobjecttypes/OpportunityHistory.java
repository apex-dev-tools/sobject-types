/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class OpportunityHistory extends SObject {
	public static SObjectType$<OpportunityHistory> SObjectType;
	public static SObjectFields$<OpportunityHistory> Fields;

	public Decimal Amount;
	public Date CloseDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Decimal ExpectedRevenue;
	public String ForecastCategory;
	public Id Id;
	public Boolean IsDeleted;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Decimal PrevAmount;
	public Date PrevCloseDate;
	public Decimal Probability;
	public String StageName;
	public Datetime SystemModstamp;

	public Opportunity[] OpportunitiesAmountChanged;
	public Opportunity[] OpportunitiesCloseDateChanged;

	public OpportunityHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
