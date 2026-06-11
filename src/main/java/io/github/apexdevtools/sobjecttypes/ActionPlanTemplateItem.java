/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ActionPlanTemplateItem extends SObject {
	public static SObjectType$<ActionPlanTemplateItem> SObjectType;
	public static SObjectFields$<ActionPlanTemplateItem> Fields;

	public Id ActionPlanTemplateVersionId;
	public ActionPlanTemplateVersion ActionPlanTemplateVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DisplayOrder;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsRequired;
	public String ItemEntityType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;
	public String UniqueName;

	public ActionPlnTmplItmDependency[] ActionPlanTemplateItemDependencies;
	public ActionPlnTmplItmDependency[] ActionPlanTemplateItemDependenciesPrevious;
	public ActionPlanTemplateItemValue[] ActionPlanTemplateItemValues;
	public ActionPlanTmplItmAssessmentInd[] ActionPlanTmpItmAssessmentInds;

	public ActionPlanTemplateItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
