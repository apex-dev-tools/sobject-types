/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
