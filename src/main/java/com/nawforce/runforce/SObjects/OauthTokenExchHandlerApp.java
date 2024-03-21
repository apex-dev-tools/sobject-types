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
public class OauthTokenExchHandlerApp extends SObject {
	public static SObjectType$<OauthTokenExchHandlerApp> SObjectType;
	public static SObjectFields$<OauthTokenExchHandlerApp> Fields;

	public Id ApexExecutionUserId;
	public User ApexExecutionUser;
	public Id ConnectedApplicationId;
	public ConnectedApplication ConnectedApplication;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OauthTokenExchangeHandlerId;
	public OauthTokenExchangeHandler OauthTokenExchangeHandler;
	public Datetime SystemModstamp;

	public OauthTokenExchHandlerApp clone$() {throw new java.lang.UnsupportedOperationException();}
	public OauthTokenExchHandlerApp clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OauthTokenExchHandlerApp clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OauthTokenExchHandlerApp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OauthTokenExchHandlerApp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
