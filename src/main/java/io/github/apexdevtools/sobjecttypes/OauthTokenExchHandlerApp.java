/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

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
	public Id ExternalClientApplicationId;
	public ExternalClientApplication ExternalClientApplication;
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
