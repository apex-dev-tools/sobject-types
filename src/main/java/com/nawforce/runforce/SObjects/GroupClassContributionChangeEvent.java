/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GroupClassContributionChangeEvent extends SObject {
	public static SObjectType$<GroupClassContributionChangeEvent> SObjectType;
	public static SObjectFields$<GroupClassContributionChangeEvent> Fields;

	public Decimal Amount;
	public Object ChangeEventHeader;
	public Id ContractGroupPlanId;
	public ContractGroupPlan ContractGroupPlan;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Date EffectiveEndDate;
	public Date EffectiveStartDate;
	public String GroupBenefitProductCategory;
	public Id GroupClassId;
	public GroupClass GroupClass;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MemberType;
	public String Name;
	public Decimal Percentage;
	public String ReplayId;
	public String Type;

	public GroupClassContributionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupClassContributionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupClassContributionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupClassContributionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupClassContributionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
