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
public class OpportunitySplitChangeEvent extends SObject {
	public static SObjectType$<OpportunitySplitChangeEvent> SObjectType;
	public static SObjectFields$<OpportunitySplitChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String ReplayId;
	public String Split;
	public String SplitNote;
	public Id SplitOwnerId;
	public User SplitOwner;
	public Decimal SplitPercentage;
	public Id SplitTypeId;
	public OpportunitySplitType SplitType;

	public OpportunitySplitChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunitySplitChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunitySplitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunitySplitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunitySplitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
