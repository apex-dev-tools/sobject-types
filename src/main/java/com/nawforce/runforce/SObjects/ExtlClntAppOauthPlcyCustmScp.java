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
public class ExtlClntAppOauthPlcyCustmScp extends SObject {
	public static SObjectType$<ExtlClntAppOauthPlcyCustmScp> SObjectType;
	public static SObjectFields$<ExtlClntAppOauthPlcyCustmScp> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id ExternalClientApplicationId;
	public ExternalClientApplication ExternalClientApplication;
	public Id ExtlClntAppOauthPlcyCnfgId;
	public ExtlClntAppOauthPlcyCnfg ExtlClntAppOauthPlcyCnfg;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OauthCustomScopeId;
	public OauthCustomScope OauthCustomScope;
	public Datetime SystemModstamp;

	public ExtlClntAppOauthPlcyCustmScp clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyCustmScp clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyCustmScp clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyCustmScp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyCustmScp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
