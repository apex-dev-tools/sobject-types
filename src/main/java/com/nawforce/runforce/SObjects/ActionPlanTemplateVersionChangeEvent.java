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
public class ActionPlanTemplateVersionChangeEvent extends SObject {
	public static SObjectType$<ActionPlanTemplateVersionChangeEvent> SObjectType;
	public static SObjectFields$<ActionPlanTemplateVersionChangeEvent> Fields;

	public Id ActionPlanTemplateId;
	public ActionPlanTemplate ActionPlanTemplate;
	public Datetime ActivationDateTime;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Datetime InactivationDateTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String Status;
	public Integer Version;

	public ActionPlanTemplateVersionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateVersionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateVersionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
