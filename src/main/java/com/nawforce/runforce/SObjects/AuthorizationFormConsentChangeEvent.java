/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AuthorizationFormConsentChangeEvent extends SObject {
	public static SObjectType$<AuthorizationFormConsentChangeEvent> SObjectType;
	public static SObjectFields$<AuthorizationFormConsentChangeEvent> Fields;

	public Id AuthorizationFormTextId;
	public AuthorizationFormText AuthorizationFormText;
	public Object ChangeEventHeader;
	public Datetime ConsentCapturedDateTime;
	public String ConsentCapturedSource;
	public String ConsentCapturedSourceType;
	public Id ConsentGiverId;
	public SObject ConsentGiver;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DocumentVersionId;
	public ContentVersion DocumentVersion;
	public Id Id;
	public Id InfoAuthRequestFormId;
	public InfoAuthRequestForm InfoAuthRequestForm;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public String ReplayId;
	public String Status;

	public AuthorizationFormConsentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
