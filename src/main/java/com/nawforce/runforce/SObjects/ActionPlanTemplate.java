/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
	public String SourceType;
	public String Status;
	public String Subcategory;
	public Datetime SystemModstamp;
	public String TargetEntityType;
	public String UniqueName;

	public ActionPlanTemplateVersion[] ActionPlanTemplateVersions;
	public ActionPlanTemplateShare[] Shares;

	public ActionPlanTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
