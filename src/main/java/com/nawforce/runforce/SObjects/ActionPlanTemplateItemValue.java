/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ActionPlanTemplateItemValue extends SObject {
	public static SObjectType$<ActionPlanTemplateItemValue> SObjectType;
	public static SObjectFields$<ActionPlanTemplateItemValue> Fields;

	public Id ActionPlanTemplateItemId;
	public ActionPlanTemplateItem ActionPlanTemplateItem;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String ItemEntityFieldName;
	public String ItemEntityType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;
	public String ValueFormula;
	public String ValueLiteral;

	public ActionPlanTemplateItemValue clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateItemValue clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateItemValue clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateItemValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanTemplateItemValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
