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
public class ExtlClntAppOauthPlcyAttr extends SObject {
	public static SObjectType$<ExtlClntAppOauthPlcyAttr> SObjectType;
	public static SObjectFields$<ExtlClntAppOauthPlcyAttr> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id ExtlClntAppOauthPlcyCnfgId;
	public ExtlClntAppOauthPlcyCnfg ExtlClntAppOauthPlcyCnfg;
	public Id Id;
	public Boolean IsDeleted;
	public String Key;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;
	public String Value;

	public ExtlClntAppOauthPlcyAttr clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyAttr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyAttr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyAttr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyAttr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
