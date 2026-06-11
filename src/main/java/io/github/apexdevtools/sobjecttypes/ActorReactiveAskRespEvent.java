/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ActorReactiveAskRespEvent extends SObject {
	public static SObjectType$<ActorReactiveAskRespEvent> SObjectType;
	public static SObjectFields$<ActorReactiveAskRespEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EncodedMessage;
	public String EventUuid;
	public String ReplayId;

	public ActorReactiveAskRespEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActorReactiveAskRespEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActorReactiveAskRespEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActorReactiveAskRespEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActorReactiveAskRespEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
