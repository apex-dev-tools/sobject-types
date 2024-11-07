/*
 * Copyright (c) ${YEAR} Certinia Inc. All rights reserved.
 */

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")


import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ${NAME} extends SObject {
	public static SObjectType$<${NAME}> SObjectType;
	public static SObjectFields$<${NAME}> Fields;

	public String Id;

	public ${NAME} clone$() {throw new java.lang.UnsupportedOperationException();}
	public ${NAME} clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ${NAME} clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ${NAME} clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ${NAME} clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
