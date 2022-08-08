/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LightningUriEventStream extends SObject {
	public static SObjectType$<LightningUriEventStream> SObjectType;
	public static SObjectFields$<LightningUriEventStream> Fields;

	public com.nawforce.runforce.System.String AppName;
	public com.nawforce.runforce.System.String ConnectionType;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DeviceId;
	public com.nawforce.runforce.System.String DeviceModel;
	public com.nawforce.runforce.System.String DevicePlatform;
	public com.nawforce.runforce.System.String DeviceSessionId;
	public Decimal Duration;
	public Decimal EffectivePageTime;
	public Datetime EventDate;
	public com.nawforce.runforce.System.String EventIdentifier;
	public com.nawforce.runforce.System.String EventUuid;
	public com.nawforce.runforce.System.String LoginKey;
	public com.nawforce.runforce.System.String Operation;
	public com.nawforce.runforce.System.String OsName;
	public com.nawforce.runforce.System.String OsVersion;
	public Datetime PageStartTime;
	public com.nawforce.runforce.System.String PageUrl;
	public com.nawforce.runforce.System.String PreviousPageAppName;
	public com.nawforce.runforce.System.String PreviousPageEntityId;
	public com.nawforce.runforce.System.String PreviousPageEntityType;
	public com.nawforce.runforce.System.String PreviousPageUrl;
	public com.nawforce.runforce.System.String QueriedEntities;
	public com.nawforce.runforce.System.String RecordId;
	public com.nawforce.runforce.System.String RelatedEventIdentifier;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String SdkAppType;
	public com.nawforce.runforce.System.String SdkAppVersion;
	public com.nawforce.runforce.System.String SdkVersion;
	public com.nawforce.runforce.System.String SessionKey;
	public com.nawforce.runforce.System.String SessionLevel;
	public com.nawforce.runforce.System.String SourceIp;
	public Id UserId;
	public User User;
	public com.nawforce.runforce.System.String UserType;
	public com.nawforce.runforce.System.String Username;

	public LightningUriEventStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEventStream clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEventStream clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEventStream clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEventStream clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
