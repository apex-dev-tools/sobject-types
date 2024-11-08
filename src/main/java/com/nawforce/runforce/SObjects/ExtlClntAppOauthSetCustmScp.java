/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class ExtlClntAppOauthSetCustmScp extends SObject {
	public static SObjectType$<ExtlClntAppOauthSetCustmScp> SObjectType;
	public static SObjectFields$<ExtlClntAppOauthSetCustmScp> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id ExternalClientApplicationId;
	public ExternalClientApplication ExternalClientApplication;
	public Id ExtlClntAppOauthSettingsId;
	public ExtlClntAppOauthSettings ExtlClntAppOauthSettings;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OauthCustomScopeId;
	public OauthCustomScope OauthCustomScope;
	public Datetime SystemModstamp;

	public ExtlClntAppOauthSetCustmScp clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthSetCustmScp clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthSetCustmScp clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthSetCustmScp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthSetCustmScp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
