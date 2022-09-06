/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CampaignMemberStatusChangeEvent extends SObject {
	public static SObjectType$<CampaignMemberStatusChangeEvent> SObjectType;
	public static SObjectFields$<CampaignMemberStatusChangeEvent> Fields;

	public Id CampaignId;
	public Campaign Campaign;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Boolean HasResponded;
	public Id Id;
	public Boolean IsDefault;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReplayId;
	public Integer SortOrder;

	public CampaignMemberStatusChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CampaignMemberStatusChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMemberStatusChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMemberStatusChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMemberStatusChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
