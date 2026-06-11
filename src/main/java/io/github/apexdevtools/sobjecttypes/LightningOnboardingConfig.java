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
public class LightningOnboardingConfig extends SObject {
	public static SObjectType$<LightningOnboardingConfig> SObjectType;
	public static SObjectFields$<LightningOnboardingConfig> Fields;

	public Id CollaborationGroupId;
	public CollaborationGroup CollaborationGroup;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomQuestion;
	public String DeveloperName;
	public Integer FeedbackFormDaysFrequency;
	public Id Id;
	public Boolean IsCustom;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Integer PromptDelayTime;
	public Boolean SendFeedbackToSalesforce;
	public Datetime SystemModstamp;

	public LightningOnboardingConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningOnboardingConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningOnboardingConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningOnboardingConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningOnboardingConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
