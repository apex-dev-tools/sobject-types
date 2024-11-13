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
public class AuthorizationFormDataUseChangeEvent extends SObject {
	public static SObjectType$<AuthorizationFormDataUseChangeEvent> SObjectType;
	public static SObjectFields$<AuthorizationFormDataUseChangeEvent> Fields;

	public Id AuthorizationFormId;
	public AuthorizationForm AuthorizationForm;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataUsePurposeId;
	public DataUsePurpose DataUsePurpose;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;

	public AuthorizationFormDataUseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormDataUseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormDataUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormDataUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormDataUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
