/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AuthFormRequestRecordChangeEvent extends SObject {
	public static SObjectType$<AuthFormRequestRecordChangeEvent> SObjectType;
	public static SObjectFields$<AuthFormRequestRecordChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InfoAuthRequestFormId;
	public InfoAuthRequestForm InfoAuthRequestForm;
	public Id InfoAuthorizationRequestId;
	public InfoAuthorizationRequest InfoAuthorizationRequest;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public String ReplayId;

	public AuthFormRequestRecordChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthFormRequestRecordChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthFormRequestRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthFormRequestRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthFormRequestRecordChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
