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
public class GameParticipantRewardChangeEvent extends SObject {
	public static SObjectType$<GameParticipantRewardChangeEvent> SObjectType;
	public static SObjectFields$<GameParticipantRewardChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime ExpirationDate;
	public Id GameParticipantId;
	public GameParticipant GameParticipant;
	public Id GameRewardId;
	public GameReward GameReward;
	public Id Id;
	public Id IssuedRewardReferenceId;
	public SObject IssuedRewardReference;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Id SourceActivityId;
	public SObject SourceActivity;
	public String Status;

	public GameParticipantRewardChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GameParticipantRewardChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GameParticipantRewardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GameParticipantRewardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GameParticipantRewardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
