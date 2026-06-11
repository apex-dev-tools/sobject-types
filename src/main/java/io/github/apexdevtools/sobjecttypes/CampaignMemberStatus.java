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
public class CampaignMemberStatus extends SObject {
	public static SObjectType$<CampaignMemberStatus> SObjectType;
	public static SObjectFields$<CampaignMemberStatus> Fields;

	public Id CampaignId;
	public Campaign Campaign;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Boolean HasResponded;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer SortOrder;
	public Datetime SystemModstamp;

	public CampaignMemberStatus clone$() {throw new java.lang.UnsupportedOperationException();}
	public CampaignMemberStatus clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMemberStatus clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMemberStatus clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMemberStatus clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
