/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ActionPlanTemplateChangeEvent extends SObject {
	public static SObjectType$<ActionPlanTemplateChangeEvent> SObjectType;
	public static SObjectFields$<ActionPlanTemplateChangeEvent> Fields;

	public String ActionPlanType;
	public String Category;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer EstimatedCompletionDays;
	public String FileBasedTemplatePath;
	public Id Id;
	public Boolean IsAdHocItemCreationEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SourceType;
	public String Status;
	public String Subcategory;
	public String TargetEntityType;
	public String UniqueName;

	public ActionPlanTemplateChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
