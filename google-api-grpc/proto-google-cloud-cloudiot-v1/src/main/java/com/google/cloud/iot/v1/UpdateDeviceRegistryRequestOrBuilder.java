// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

public interface UpdateDeviceRegistryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.UpdateDeviceRegistryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
   */
  boolean hasDeviceRegistry();
  /**
   * <pre>
   * The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry();
  /**
   * <pre>
   * The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
   */
  com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder();

  /**
   * <pre>
   * Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
