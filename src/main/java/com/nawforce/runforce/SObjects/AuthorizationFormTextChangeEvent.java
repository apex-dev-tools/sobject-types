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
public class AuthorizationFormTextChangeEvent extends SObject {
	public static SObjectType$<AuthorizationFormTextChangeEvent> SObjectType;
	public static SObjectFields$<AuthorizationFormTextChangeEvent> Fields;

	public Id AuthorizationFormId;
	public AuthorizationForm AuthorizationForm;
	public Object ChangeEventHeader;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FullAuthorizationFormUrl;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Locale;
	public String LocaleSelection;
	public String Name;
	public String ReplayId;
	public String SummaryAuthFormText;

	public AuthorizationFormTextChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormTextChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormTextChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormTextChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormTextChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
