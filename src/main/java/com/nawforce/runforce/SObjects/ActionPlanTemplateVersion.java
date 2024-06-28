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
public class ActionPlanTemplateVersion extends SObject {
	public static SObjectType$<ActionPlanTemplateVersion> SObjectType;
	public static SObjectFields$<ActionPlanTemplateVersion> Fields;

	public Id ActionPlanTemplateId;
	public ActionPlanTemplate ActionPlanTemplate;
	public Datetime ActivationDateTime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Datetime InactivationDateTime;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;
	public Integer Version;

	public ActionPlanTemplateItem[] ActionPlanTemplateItems;

	public ActionPlanTemplateVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
