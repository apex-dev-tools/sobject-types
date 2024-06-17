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
public class InfoAuthRequestFormChangeEvent extends SObject {
	public static SObjectType$<InfoAuthRequestFormChangeEvent> SObjectType;
	public static SObjectFields$<InfoAuthRequestFormChangeEvent> Fields;

	public Id AuthorizationFormTextId;
	public AuthorizationFormText AuthorizationFormText;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InfoAuthorizationRequestId;
	public InfoAuthorizationRequest InfoAuthorizationRequest;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LatestAuthFormConsentId;
	public AuthorizationFormConsent LatestAuthFormConsent;
	public Datetime LatestResponseDateTime;
	public String Name;
	public String ReplayId;
	public String ResponseStatus;

	public InfoAuthRequestFormChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthRequestFormChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthRequestFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthRequestFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthRequestFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
