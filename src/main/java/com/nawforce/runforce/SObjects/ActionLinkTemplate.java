/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ActionLinkTemplate extends SObject {
	public static SObjectType$<ActionLinkTemplate> SObjectType;
	public static SObjectFields$<ActionLinkTemplate> Fields;

	public Id ActionLinkGroupTemplateId;
	public ActionLinkGroupTemplate ActionLinkGroupTemplate;
	public String ActionUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Headers;
	public Id Id;
	public Boolean IsConfirmationRequired;
	public Boolean IsDeleted;
	public Boolean IsGroupDefault;
	public String Label;
	public String LabelKey;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LinkType;
	public String Method;
	public Integer Position;
	public String RequestBody;
	public Datetime SystemModstamp;
	public String UserAlias;
	public String UserVisibility;

	public ActionLinkTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionLinkTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
