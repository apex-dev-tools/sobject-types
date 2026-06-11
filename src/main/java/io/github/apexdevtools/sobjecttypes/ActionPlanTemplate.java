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
public class ActionPlanTemplate extends SObject {
	public static SObjectType$<ActionPlanTemplate> SObjectType;
	public static SObjectFields$<ActionPlanTemplate> Fields;

	public String ActionPlanType;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer EstimatedCompletionDays;
	public String FileBasedTemplatePath;
	public Id Id;
	public Boolean IsAdHocItemCreationEnabled;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProcessType;
	public String SourceType;
	public String Status;
	public String Subcategory;
	public Datetime SystemModstamp;
	public String TargetEntityType;
	public String UniqueName;
	public String Version;

	public ActionPlanTemplateVersion[] ActionPlanTemplateVersions;
	public ActionPlanTemplateShare[] Shares;

	public ActionPlanTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
