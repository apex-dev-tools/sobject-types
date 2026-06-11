/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
