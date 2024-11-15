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
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LightningUriEventStream extends SObject {
	public static SObjectType$<LightningUriEventStream> SObjectType;
	public static SObjectFields$<LightningUriEventStream> Fields;

	public String AppName;
	public String ConnectionType;
	public Datetime CreatedDate;
	public String DeviceId;
	public String DeviceModel;
	public String DevicePlatform;
	public String DeviceSessionId;
	public Decimal Duration;
	public Decimal EffectivePageTime;
	public String EffectivePageTimeDeviationErrorType;
	public String EffectivePageTimeDeviationReason;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Boolean HasEffectivePageTimeDeviation;
	public String LoginKey;
	public String Operation;
	public String OsName;
	public String OsVersion;
	public Datetime PageStartTime;
	public String PageUrl;
	public String PreviousPageAppName;
	public String PreviousPageEntityId;
	public String PreviousPageEntityType;
	public String PreviousPageUrl;
	public String QueriedEntities;
	public String RecordId;
	public String RelatedEventIdentifier;
	public String ReplayId;
	public String SdkAppType;
	public String SdkAppVersion;
	public String SdkVersion;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String UserAgent;
	public Id UserId;
	public User User;
	public String UserType;
	public String Username;

	public LightningUriEventStream clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEventStream clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEventStream clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEventStream clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
