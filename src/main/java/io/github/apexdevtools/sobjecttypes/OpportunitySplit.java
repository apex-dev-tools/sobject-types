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
public class OpportunitySplit extends SObject {
	public static SObjectType$<OpportunitySplit> SObjectType;
	public static SObjectFields$<OpportunitySplit> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String Split;
	public Decimal SplitAmount;
	public String SplitNote;
	public Id SplitOwnerId;
	public User SplitOwner;
	public Decimal SplitPercentage;
	public Id SplitTypeId;
	public OpportunitySplitType SplitType;
	public Datetime SystemModstamp;

	public OpportunitySplit clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunitySplit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunitySplit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunitySplit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunitySplit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
