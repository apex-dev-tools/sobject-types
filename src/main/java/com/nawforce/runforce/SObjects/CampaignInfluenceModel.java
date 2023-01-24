/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CampaignInfluenceModel extends SObject {
	public static SObjectType$<CampaignInfluenceModel> SObjectType;
	public static SObjectFields$<CampaignInfluenceModel> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDefaultModel;
	public Boolean IsDeleted;
	public Boolean IsModelLocked;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String ModelDescription;
	public String ModelType;
	public String NamespacePrefix;
	public String RecordPreference;
	public Datetime SystemModstamp;

	public CampaignInfluenceModel clone$() {throw new java.lang.UnsupportedOperationException();}
	public CampaignInfluenceModel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CampaignInfluenceModel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CampaignInfluenceModel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CampaignInfluenceModel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
